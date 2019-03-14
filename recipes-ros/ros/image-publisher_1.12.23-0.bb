DESCRIPTION = ""
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge dynamic-reconfigure camera-info-manager image-transport nodelet roscpp sensor-msgs cv-bridge dynamic-reconfigure camera-info-manager image-transport nodelet roscpp sensor-msgs"

RDEPENDS_${PN} = "cv-bridge dynamic-reconfigure camera-info-manager image-transport nodelet roscpp sensor-msgs"

SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/melodic/image_publisher/1.12.23-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6d4788470d40c8b34ef16bf680b5be38"
SRC_URI[sha256sum] = "56bebe095951f6cfb7e0d4c0250ed2dea459b085b214b9e21cdd93f4878efa4a"

ROS_SPN = "image_pipeline"
S = "${WORKDIR}/image_pipeline-release-release-melodic-image_publisher-1.12.23-0"

inherit catkin
