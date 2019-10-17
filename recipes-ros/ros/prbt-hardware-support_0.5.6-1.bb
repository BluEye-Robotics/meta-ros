DESCRIPTION = "Control hardware functions of the PRBT manipulator like STO for Stop1 functionality."
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "canopen-chain-node roscpp libmodbus-dev message-generation std-msgs std-srvs sensor-msgs message-filters roscpp message-runtime std-msgs std-srvs sensor-msgs"

RDEPENDS_${PN} = "roscpp message-runtime std-msgs std-srvs sensor-msgs"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/prbt_hardware_support/0.5.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1c860d5866f481a03e214a248d90b65e"
SRC_URI[sha256sum] = "fa6937adc062d26cd7dd7649a30566ed4999d17eca99a6f5b0ff8191e99c7dcf"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-prbt_hardware_support-0.5.6-1"

inherit catkin
