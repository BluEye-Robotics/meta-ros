DESCRIPTION = ""
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge dynamic-reconfigure camera-info-manager image-transport nodelet roscpp sensor-msgs cv-bridge dynamic-reconfigure camera-info-manager image-transport nodelet roscpp sensor-msgs"

RDEPENDS_${PN} = "cv-bridge dynamic-reconfigure camera-info-manager image-transport nodelet roscpp sensor-msgs"

SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/melodic/image_publisher/1.13.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3532186798309b3a3af5c51be9beb8ee"
SRC_URI[sha256sum] = "8b0416edac96a5993367ff887c7187345ce36d6a2e52c0f7cd5d6501642d1da4"

ROS_SPN = "image_pipeline"
S = "${WORKDIR}/image_pipeline-release-release-melodic-image_publisher-1.13.0-1"

inherit catkin
