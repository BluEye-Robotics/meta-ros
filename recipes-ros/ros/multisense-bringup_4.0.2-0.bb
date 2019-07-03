DESCRIPTION = "multisense_bringup"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "multisense-ros multisense-description multisense-ros multisense-description"

RDEPENDS_${PN} = "multisense-ros multisense-description"

SRC_URI = "https://github.com/carnegieroboticsllc/multisense_ros-release/archive/release/melodic/multisense_bringup/4.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f1673921540c44c402b55880095808f3"
SRC_URI[sha256sum] = "82520ea279a265a4015699da6af28432d11f37ea05b9c742774c83a989fa1294"

ROS_SPN = "multisense_ros"
S = "${WORKDIR}/multisense_ros-release-release-melodic-multisense_bringup-4.0.2-0"

inherit catkin
