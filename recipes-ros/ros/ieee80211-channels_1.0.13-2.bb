DESCRIPTION = "This package provides mapping from frequencies to IEEE802. 11 channels and vice-versa."
AUTHOR = "Catalin Drula"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/ieee80211_channels/1.0.13-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "27c58143a4418e49a6030005810c153c"
SRC_URI[sha256sum] = "80f472b6cc80c82eacfbf5b1bdba951fa3d53730041b74aa7261aa56cc2e5ecf"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-ieee80211_channels-1.0.13-2"

inherit catkin
