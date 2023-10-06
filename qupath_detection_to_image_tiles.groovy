def target_path = PATH_PLACEHOLDER

def detections = getDetectionObjects()
def newAnnotations = detections.collect {
    return PathObjects.createAnnotationObject(it.getROI(), it.getPathClass())
}
removeObjects(detections, true)
addObjects(newAnnotations)

hierarchy = getCurrentHierarchy()
def annotations = getAnnotationObjects()
def server = getCurrentServer()
def path = server.getPath()
def id = 1

for (annotation in annotations) {
    hierarchy.getSelectionModel().setSelectedObject(annotation)
    def requestROI = RegionRequest.createInstance(server.getPath(), 1, getSelectedROI())
    writeImageRegion(server, requestROI, target_path)
    id = id + 1
}