DESCRIPTION = "Control hardware functions of the PRBT manipulator like STO for Stop1 functionality."
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "roscpp libmodbus-dev message-generation std-msgs std-srvs message-filters roscpp message-runtime std-msgs std-srvs"

RDEPENDS_${PN} = "roscpp message-runtime std-msgs std-srvs"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/prbt_hardware_support/0.5.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9f03f3cc621c6dcd80ca2e4ef2cfde3e"
SRC_URI[sha256sum] = "544485f23cfc387fc67fbba6ddb48f77b2f27c1c2fe2abc01c19ef31bd392671"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-prbt_hardware_support-0.5.2-0"

inherit catkin
