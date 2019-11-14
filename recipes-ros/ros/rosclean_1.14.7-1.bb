DESCRIPTION = "rosclean: cleanup filesystem resources (e. g. log files)."
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "python-rospkg"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosclean/1.14.7-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5cd383f5281bcaa97f77443ba9de01ae"
SRC_URI[sha256sum] = "9c7d4ae5d38c790a8cf65e1110cc0f08a8a667a71627679fc258fafc9d986e85"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosclean-1.14.7-1"

inherit catkin
