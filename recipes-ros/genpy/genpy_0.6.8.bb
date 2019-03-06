DESCRIPTION = "Python ROS message and service generators."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg ${PYTHON_PN}-pyyaml"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "453ad6a589eb81c79e70c0712cbed318"
SRC_URI[sha256sum] = "79dd592863a236dd9488bd9525796212730a7a520fde7e8b1f53cd9f032c4da7"

inherit catkin

RDEPENDS_${PN} = "${PYTHON_PN}-math genmsg ${PYTHON_PN}-shell"
RDEPENDS_${PN}_class-native = ""
