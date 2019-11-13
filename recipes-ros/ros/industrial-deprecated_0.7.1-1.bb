DESCRIPTION = "The Industrial deprecated package contains nodes, launch files, etc. . . that are slated for deprecation. This package is the last place something will end up before being deleted. If you are missing a package/node and find it's contents here, then you should consider a replacement."
AUTHOR = "Shaun Edwards"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_deprecated/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ae1bd503edd5afac87877a91aaf27dd9"
SRC_URI[sha256sum] = "e5b98eb82ac07f838ac0929adb85b15d830460d5e54b52bc92167ae991a213ac"

ROS_SPN = "industrial_core"
S = "${WORKDIR}/industrial_core-release-release-melodic-industrial_deprecated-0.7.1-1"

inherit catkin
