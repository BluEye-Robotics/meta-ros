DESCRIPTION = "Metapackage for Clearpath Husky visualization software"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "husky-viz husky-msgs"

RDEPENDS_${PN} = "husky-viz husky-msgs"

SRC_URI = "https://github.com/clearpath-gbp/husky-release/archive/release/melodic/husky_desktop/0.4.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9e646946c3c619c7a6c58da8e2ba4f2e"
SRC_URI[sha256sum] = "f0f545eb9930687278ea4f5e93c89858fa430187d80c27567c26513a9cc33aea"

ROS_SPN = "husky"
S = "${WORKDIR}/husky-release-release-melodic-husky_desktop-0.4.1-1"

inherit catkin
