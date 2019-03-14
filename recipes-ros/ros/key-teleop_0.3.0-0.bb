DESCRIPTION = "A text-based interface to send a robot movement commands"
AUTHOR = "Siegfried-A. Gevatter Pujals"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy geometry-msgs"

RDEPENDS_${PN} = "rospy geometry-msgs"

SRC_URI = "https://github.com/ros-gbp/teleop_tools-release/archive/release/melodic/key_teleop/0.3.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0788e9c2dddbafd4e75e81b9300ea0e9"
SRC_URI[sha256sum] = "06f164a11e5deeab452048a9d404d302ac6b82f351df562da48abaf604019286"

ROS_SPN = "teleop_tools"
S = "${WORKDIR}/teleop_tools-release-release-melodic-key_teleop-0.3.0-0"

inherit catkin
