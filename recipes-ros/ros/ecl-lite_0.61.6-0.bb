DESCRIPTION = "Libraries and utilities for embedded and low-level linux development."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-config ecl-converters-lite ecl-errors ecl-io ecl-sigslots-lite ecl-time-lite"

RDEPENDS_${PN} = "ecl-config ecl-converters-lite ecl-errors ecl-io ecl-sigslots-lite ecl-time-lite"

SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/melodic/ecl_lite/0.61.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "878da7675c89541f5d7f8e4259108fcf"
SRC_URI[sha256sum] = "fceacb01c4b94197a2e6f342c6a76f5a9af13273e9cda61c75c4b3702e3aea3f"

S = "${WORKDIR}/ecl_lite-release-release-melodic-ecl_lite-0.61.6-0"

inherit catkin
