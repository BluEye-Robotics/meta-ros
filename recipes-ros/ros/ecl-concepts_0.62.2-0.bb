DESCRIPTION = "Introduces a compile time concept checking mechanism that can be used most commonly to check for required functionality when passing template arguments."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-config ecl-type-traits ecl-license ecl-config ecl-type-traits"

RDEPENDS_${PN} = "ecl-license ecl-config ecl-type-traits"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_concepts/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f63b5f28f0e7c42425a44fad63b6499e"
SRC_URI[sha256sum] = "d34dac272c3aa77d62056445748c784c6a9acf8f4fc69945d6dd05be8dcc7815"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_concepts-0.62.2-0"

inherit catkin
