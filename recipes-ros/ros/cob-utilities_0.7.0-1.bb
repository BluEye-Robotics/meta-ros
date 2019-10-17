DESCRIPTION = "Deprecated "cob_utilities" subsumes a number of classes, which are used in the original COb3 software. E. g. "IniFile. h" supports the original inifile structure of Care-O-bot 3. "MathSup. h" provides some basic functions like conversion from degree to radion or norming of angles within +/- PI. The package is currently used while the drivers are ported to ROS and Orocos respectively. Midterm it shall be removed and the ROS structures shall be used for reading parameters during initialization. So, don't use this package in new code!"
AUTHOR = "Christian Connette"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_utilities/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9d4a930d66b7aea22137e81d45be222c"
SRC_URI[sha256sum] = "6f477f07e09f122c8f09c6aa6410e212b61ab819b6dcba8d8603a0c5bc15febf"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_utilities-0.7.0-1"

inherit catkin
