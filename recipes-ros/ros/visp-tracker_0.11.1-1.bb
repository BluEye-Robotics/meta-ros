DESCRIPTION = "Wraps the ViSP moving edge tracker provided by the ViSP visual servoing library into a ROS package. This computer vision algorithm computes the pose (i. e. position and orientation) of an object in an image. It is fast enough to allow object online tracking using a camera."
AUTHOR = "Thomas Moulard"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "message-generation dynamic-reconfigure nodelet roscpp rospy std-msgs sensor-msgs geometry-msgs image-proc image-transport resource-retriever tf visp message-runtime message-generation dynamic-reconfigure nodelet roscpp rospy std-msgs sensor-msgs geometry-msgs image-proc image-transport resource-retriever tf visp"

RDEPENDS_${PN} = "message-runtime message-generation dynamic-reconfigure nodelet roscpp rospy std-msgs sensor-msgs geometry-msgs image-proc image-transport resource-retriever tf visp"

SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/melodic/visp_tracker/0.11.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "89083b8a64625fa503933463acb8a3ea"
SRC_URI[sha256sum] = "f8f5b6ded7bc1e1a83f5e8ad2787c9e096a4e4a347bcdc9cd33665e8383e4b75"

ROS_SPN = "vision_visp"
S = "${WORKDIR}/vision_visp-release-release-melodic-visp_tracker-0.11.1-1"

inherit catkin
