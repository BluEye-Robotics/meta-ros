DESCRIPTION = "Deprecated "cob_utilities" subsumes a number of classes, which are used in the original COb3 software. E. g. "IniFile. h" supports the original inifile structure of Care-O-bot 3. "MathSup. h" provides some basic functions like conversion from degree to radion or norming of angles within +/- PI. The package is currently used while the drivers are ported to ROS and Orocos respectively. Midterm it shall be removed and the ROS structures shall be used for reading parameters during initialization. So, don't use this package in new code!"
AUTHOR = "Christian Connette"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_utilities/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d539b7a7f854ec892682276e42af8efd"
SRC_URI[sha256sum] = "eda1b8b66c13a03e7bc41d089611085fe8e99e5bd7b0cdc92c2f8902adfdb952"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_utilities-0.7.1-1"

inherit catkin
