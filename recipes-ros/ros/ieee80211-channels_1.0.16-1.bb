DESCRIPTION = "This package provides mapping from frequencies to IEEE802. 11 channels and vice-versa."
AUTHOR = "Catalin Drula"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/ieee80211_channels/1.0.16-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "882c4d99ed7d0bfdccc2c5de9ecf94f4"
SRC_URI[sha256sum] = "0fdd1c65ca9d698ae50345ae73904b34161753ada49f53ddceec13066f9bd355"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-ieee80211_channels-1.0.16-1"

inherit catkin
