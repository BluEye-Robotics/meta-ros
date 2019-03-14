DESCRIPTION = "Scripts and tools for running the application manager on the PR2."
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "app-manager willow-maps"

RDEPENDS_${PN} = "app-manager willow-maps"

SRC_URI = "https://github.com/pr2-gbp/pr2_apps-release/archive/release/melodic/pr2_app_manager/0.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5b6e5a6fe0459eda8a03fae6343e167b"
SRC_URI[sha256sum] = "efb64b17c3475ef039056ad31ceeebc17296ff0be259a5507b0b8e6fdcffb93b"

ROS_SPN = "pr2_apps"
S = "${WORKDIR}/pr2_apps-release-release-melodic-pr2_app_manager-0.6.1-0"

inherit catkin
