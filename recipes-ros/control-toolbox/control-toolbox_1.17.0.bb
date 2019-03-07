DESCRIPTION = "The control toolbox contains modules that are useful across all controllers."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "control-msgs rosconsole tf roscpp angles message-generation dynamic-reconfigure libtinyxml \
    realtime-tools message-filters ${PYTHON_PN}-rospkg"

SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "125785aaeee2eb05a76d0dbeb3965d46"
SRC_URI[sha256sum] = "f137b29311f2bef60f910d411c43dd123a3c7609f9e438796b80144e19b696c8"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
