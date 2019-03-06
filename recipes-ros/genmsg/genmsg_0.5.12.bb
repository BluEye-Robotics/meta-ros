DESCRIPTION = "Standalone Python library for generating ROS message and service data structures for various languages."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "26c387390b88fe2339ed58c4dcdc33f5"
SRC_URI[sha256sum] = "0e29bde730b4e114d1050998e833681fa3917f530cfab674e71fa21677d2a7ae"

inherit catkin

RDEPENDS_${PN} = "${PYTHON_PN}-stringold ${PYTHON_PN}-pprint"
RDEPENDS_${PN}_class-native = ""
