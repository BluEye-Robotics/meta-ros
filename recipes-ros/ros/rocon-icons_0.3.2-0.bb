DESCRIPTION = "Icons for rocon."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-catkin-pkg"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/melodic/rocon_icons/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bbbd15a4f0ada95940dc0dd58969422f"
SRC_URI[sha256sum] = "06a97efd4802a2cd6b1e27fe7d1fa81a67923d0affb7ac21b53954225dace487"

ROS_SPN = "rocon_tools"
S = "${WORKDIR}/rocon_tools-release-release-melodic-rocon_icons-0.3.2-0"

inherit catkin
