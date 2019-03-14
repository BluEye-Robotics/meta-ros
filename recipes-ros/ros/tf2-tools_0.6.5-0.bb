DESCRIPTION = "tf2_tools"
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "tf2-msgs tf2 tf2-ros tf2-msgs tf2 tf2-ros"

RDEPENDS_${PN} = "tf2-msgs tf2 tf2-ros"

SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/melodic/tf2_tools/0.6.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "88c649071d9c353acbb2e7989de87a32"
SRC_URI[sha256sum] = "c474f792ecac52bec866f11bb705444141ea38f2e9f23fc1513307a4681ef724"

ROS_SPN = "geometry2"
S = "${WORKDIR}/geometry2-release-release-melodic-tf2_tools-0.6.5-0"

inherit catkin
