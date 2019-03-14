DESCRIPTION = "A set of generic teleoperation tools for any robot."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "joy-teleop key-teleop teleop-tools-msgs"

RDEPENDS_${PN} = "joy-teleop key-teleop teleop-tools-msgs"

SRC_URI = "https://github.com/ros-gbp/teleop_tools-release/archive/release/melodic/teleop_tools/0.3.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "70dffe69695427426526c094c44b1805"
SRC_URI[sha256sum] = "13fa3947b654ea8548445a755c14e39bd83c9aa2e5df261d75febda38d013594"

S = "${WORKDIR}/teleop_tools-release-release-melodic-teleop_tools-0.3.0-0"

inherit catkin
