DESCRIPTION = "The pr2_mannequin_mode package"
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pr2-controllers-msgs pr2-controller-manager trajectory-msgs pr2-controllers-msgs pr2-controller-manager trajectory-msgs"

RDEPENDS_${PN} = "pr2-controllers-msgs pr2-controller-manager trajectory-msgs"

SRC_URI = "https://github.com/pr2-gbp/pr2_apps-release/archive/release/melodic/pr2_mannequin_mode/0.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "efd1f53b7269de4014ae7e403219a84b"
SRC_URI[sha256sum] = "bd942a926267442a2232ac55b6019f8aa0e6494879ca4030ab18837c93e1f37f"

ROS_SPN = "pr2_apps"
S = "${WORKDIR}/pr2_apps-release-release-melodic-pr2_mannequin_mode-0.6.1-0"

inherit catkin
