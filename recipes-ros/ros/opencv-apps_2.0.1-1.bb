DESCRIPTION = ""
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge dynamic-reconfigure image-transport message-generation nodelet roscpp sensor-msgs std-msgs std-srvs cv-bridge dynamic-reconfigure image-transport message-runtime nodelet roscpp sensor-msgs std-msgs std-srvs"

RDEPENDS_${PN} = "cv-bridge dynamic-reconfigure image-transport message-runtime nodelet roscpp sensor-msgs std-msgs std-srvs"

SRC_URI = "https://github.com/ros-perception/opencv_apps-release/archive/release/melodic/opencv_apps/2.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "424b941292bc77336340f2d7b31664da"
SRC_URI[sha256sum] = "11489debf5d3b3dc194472f483d67857db62f76665f6785ad4f55882c4e4d3dc"

S = "${WORKDIR}/opencv_apps-release-release-melodic-opencv_apps-2.0.1-1"

inherit catkin
