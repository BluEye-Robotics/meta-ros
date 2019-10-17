DESCRIPTION = "The pybind11 package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python python3-numpy rospy libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/wxmerkt/pybind11_catkin-release/archive/release/melodic/pybind11_catkin/2.2.4-6.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "511e18eda11679ce3a209d1f59aa2583"
SRC_URI[sha256sum] = "5252e0b91e05e1f8d2cb6bd845b6c29d53e704c82511371a7be979d51a488f48"

S = "${WORKDIR}/pybind11_catkin-release-release-melodic-pybind11_catkin-2.2.4-6"

inherit catkin
