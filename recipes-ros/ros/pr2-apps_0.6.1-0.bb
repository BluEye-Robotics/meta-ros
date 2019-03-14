DESCRIPTION = "Basic applications for the PR2 robot"
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pr2-position-scripts pr2-teleop-general pr2-tuckarm pr2-app-manager pr2-mannequin-mode pr2-kinematics"

RDEPENDS_${PN} = "pr2-position-scripts pr2-teleop-general pr2-tuckarm pr2-app-manager pr2-mannequin-mode pr2-kinematics"

SRC_URI = "https://github.com/pr2-gbp/pr2_apps-release/archive/release/melodic/pr2_apps/0.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d4085c3f65299d1139ce31458f17cfb0"
SRC_URI[sha256sum] = "a471719fbd2ecf7326f9e8fa12dcb54af210539ab199fb080a2f942825665d8a"

S = "${WORKDIR}/pr2_apps-release-release-melodic-pr2_apps-0.6.1-0"

inherit catkin
