DESCRIPTION = "This package contains a number of URDF tutorials."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7d15993c386fa59ecb8bbb3038ccb78f"
SRC_URI[sha256sum] = "d918909e6ec039423b434efe44b7a9fa08ea21b43f64c314b985b9c134d9921d"

S = "${WORKDIR}/${ROS_SP}/${ROS_SPN}"

inherit catkin
