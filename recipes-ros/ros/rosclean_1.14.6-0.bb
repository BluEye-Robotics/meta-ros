DESCRIPTION = "rosclean: cleanup filesystem resources (e. g. log files)."
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-rospkg"

RDEPENDS_${PN} = "python-rospkg"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosclean/1.14.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c06bd9645f48622555c4f711528b86d6"
SRC_URI[sha256sum] = "f9c6f91fd318a4471c630ba841eca82ee54033ed62be5e7187255f79a51a83c8"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosclean-1.14.6-0"

inherit catkin
