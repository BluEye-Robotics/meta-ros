DESCRIPTION = "Control hardware functions of the PRBT manipulator like STO for Stop1 functionality."
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "canopen-chain-node roscpp libmodbus-dev message-generation std-msgs std-srvs sensor-msgs message-filters tf2 tf2-geometry-msgs tf2-ros urdf dynamic-reconfigure roscpp message-runtime std-msgs std-srvs sensor-msgs"

RDEPENDS_${PN} = "roscpp message-runtime std-msgs std-srvs sensor-msgs"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/prbt_hardware_support/0.5.10-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0f7d48bcc55c64d5f8d9d4b94d17352e"
SRC_URI[sha256sum] = "34b6e82ba00b42194306e5725e8d2c11cf86961a3d393ad11dbc77049f322167"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-prbt_hardware_support-0.5.10-1"

inherit catkin
