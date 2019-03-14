DESCRIPTION = "rosclean: cleanup filesystem resources (e. g. log files)."
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-rospkg"

RDEPENDS_${PN} = "python-rospkg"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosclean/1.14.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c7a0380c187d51f65bfd66cd8a656b6e"
SRC_URI[sha256sum] = "4e373facde1caad20ac439fe1867f8909a8c8cff99536dfe790683df163c048a"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosclean-1.14.5-0"

inherit catkin
