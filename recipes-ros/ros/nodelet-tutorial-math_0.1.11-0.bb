DESCRIPTION = "Package for Nodelet tutorial."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "nodelet roscpp std-msgs nodelet roscpp std-msgs"

RDEPENDS_${PN} = "nodelet roscpp std-msgs"

SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/melodic/nodelet_tutorial_math/0.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5325b0a3d645201269d3f51a1c4641b4"
SRC_URI[sha256sum] = "399778f44a140cd9fd5b0ed41b8c88408803791a64b0c3d006bca4b174b1669f"

ROS_SPN = "common_tutorials"
S = "${WORKDIR}/common_tutorials-release-release-melodic-nodelet_tutorial_math-0.1.11-0"

inherit catkin
