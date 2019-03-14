DESCRIPTION = "The pr2_mechanism stack contains the infrastructure to control the PR2 robot in a hard realtime control loop."
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pr2-mechanism-model pr2-controller-interface pr2-controller-manager pr2-mechanism-diagnostics pr2-hardware-interface"

RDEPENDS_${PN} = "pr2-mechanism-model pr2-controller-interface pr2-controller-manager pr2-mechanism-diagnostics pr2-hardware-interface"

SRC_URI = "https://github.com/pr2-gbp/pr2_mechanism-release/archive/release/melodic/pr2_mechanism/1.8.18-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5706318ccaedfaa444214e29986203f2"
SRC_URI[sha256sum] = "c6ed5bf479132aac212fc57681dc0223a03708b808e2ee0c0c8c27318348f468"

S = "${WORKDIR}/pr2_mechanism-release-release-melodic-pr2_mechanism-1.8.18-0"

inherit catkin
