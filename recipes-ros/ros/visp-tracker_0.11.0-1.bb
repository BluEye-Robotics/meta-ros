DESCRIPTION = "Wraps the ViSP moving edge tracker provided by the ViSP visual servoing library into a ROS package. This computer vision algorithm computes the pose (i. e. position and orientation) of an object in an image. It is fast enough to allow object online tracking using a camera."
AUTHOR = "Thomas Moulard"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation dynamic-reconfigure nodelet roscpp rospy std-msgs sensor-msgs geometry-msgs image-proc image-transport resource-retriever tf visp message-runtime message-generation dynamic-reconfigure nodelet roscpp rospy std-msgs sensor-msgs geometry-msgs image-proc image-transport resource-retriever tf visp"

RDEPENDS_${PN} = "message-runtime message-generation dynamic-reconfigure nodelet roscpp rospy std-msgs sensor-msgs geometry-msgs image-proc image-transport resource-retriever tf visp"

SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/melodic/visp_tracker/0.11.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9d28aab6ce18acfdfec40a3029a5e000"
SRC_URI[sha256sum] = "3de4c96dc7dc9b6016fed2fc710cfa6a8e3fc693fbaa27ea4652756ec32a6b3b"

ROS_SPN = "vision_visp"
S = "${WORKDIR}/vision_visp-release-release-melodic-visp_tracker-0.11.0-1"

inherit catkin
