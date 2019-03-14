DESCRIPTION = ""
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge dynamic-reconfigure image-transport message-generation nodelet roscpp std-msgs std-srvs cv-bridge dynamic-reconfigure image-transport message-runtime nodelet roscpp std-msgs std-srvs"

RDEPENDS_${PN} = "cv-bridge dynamic-reconfigure image-transport message-runtime nodelet roscpp std-msgs std-srvs"

SRC_URI = "https://github.com/ros-perception/opencv_apps-release/archive/release/melodic/opencv_apps/2.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4e115ec5c0772567782e8d6084caf763"
SRC_URI[sha256sum] = "8dfed794573f2526432a6d0066f5af7158d2b405ebd78eec02d14e86872266c0"

S = "${WORKDIR}/opencv_apps-release-release-melodic-opencv_apps-2.0.0-0"

inherit catkin
