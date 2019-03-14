DESCRIPTION = "The robot_upstart package provides scripts which may be used to install and uninstall Ubuntu Linux upstart jobs which launch groups of roslaunch files."
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "daemontools roslaunch xacro"

SRC_URI = "https://github.com/clearpath-gbp/robot_upstart-release/archive/release/melodic/robot_upstart/0.3.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "de225db2653d99f8c964be287fa4ef91"
SRC_URI[sha256sum] = "a275ce760e7a19ed7b1f120e6b1a3e3c1043f35c5b9bc116a0ba9ed8a633531e"

S = "${WORKDIR}/robot_upstart-release-release-melodic-robot_upstart-0.3.0-0"

inherit catkin
