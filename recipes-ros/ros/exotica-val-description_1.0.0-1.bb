DESCRIPTION = "val_description version including our updated meshes for unit testing and visualisation. Based on the OpenHumanoids fork of the val_description package by NASA JSC. The most current version of the original package can be found at http://gitlab. com/nasa-jsc-robotics/val_description"
AUTHOR = ""
SECTION = "devel"
LICENSE = "NASA-1.3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=66432e857bf21180c0bbef7cde4f8a21"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/wxmerkt/exotica_val_description-release/archive/release/melodic/exotica_val_description/1.0.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "830b6ab09268097d33c6f0b755dded3c"
SRC_URI[sha256sum] = "9ffa2502040e704ba54e21b691521ba3e3213011535eef52b7af2a4222dcc8cd"

S = "${WORKDIR}/exotica_val_description-release-release-melodic-exotica_val_description-1.0.0-1"

inherit catkin
