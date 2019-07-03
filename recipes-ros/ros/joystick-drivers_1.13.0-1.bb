DESCRIPTION = "This metapackage depends on packages for interfacing common joysticks and human input devices with ROS."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "joy ps3joy spacenav-node wiimote"

SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/melodic/joystick_drivers/1.13.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0bb8390418a3c9d963dfee25164985a2"
SRC_URI[sha256sum] = "40f5d279303bcca1d36d8c540ebb8b57a67269d7bca43fe7db89c400f3edb9b8"

S = "${WORKDIR}/joystick_drivers-release-release-melodic-joystick_drivers-1.13.0-1"

inherit catkin
