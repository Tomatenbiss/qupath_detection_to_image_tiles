# qupath_detection_to_image_tiles
This is just a groovy script to convert QuPath detections into image tiles. 

# usage
To use the script, simply replace the PATH_PLACEHOLDER with the destination directory, where your image tiles shall be created. Keep in mind than when you work with Windows you will need to use double Backslashes (\\) instead of single ones (\) in that path.

When using this script, all detections will be transformed into annotations. If you want to keep them, you can you can remove line 7 (`removeObjects(detections, true)`).