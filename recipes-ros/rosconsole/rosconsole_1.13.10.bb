DESCRIPTION = "ROS console output library."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "apr boost cpp-common log4cxx rostime rosunit"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "af3965fe5012ba2b96f1468c39869e55"
SRC_URI[sha256sum] = "fc4376acac3c4b786fc362cb26e2d683e0687656f9cb7ad66d02464d3935e777"

inherit catkin
