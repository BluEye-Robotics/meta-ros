DESCRIPTION = "Clearpath Husky controller configurations"
AUTHOR = "Paul Bovbel"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch husky-description interactive-marker-twist-server diff-drive-controller joint-state-controller joint-trajectory-controller joy multimaster-launch robot-localization rostopic robot-state-publisher controller-manager teleop-twist-joy twist-mux"

RDEPENDS_${PN} = "husky-description interactive-marker-twist-server diff-drive-controller joint-state-controller joint-trajectory-controller joy multimaster-launch robot-localization rostopic robot-state-publisher controller-manager teleop-twist-joy twist-mux"

SRC_URI = "https://github.com/clearpath-gbp/husky-release/archive/release/melodic/husky_control/0.4.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1ec2414c25fb4676bca45075681126ff"
SRC_URI[sha256sum] = "7eb61be9b4b8876ca17bcc6a45846d47a5145e9f36598087c769a821c3829119"

ROS_SPN = "husky"
S = "${WORKDIR}/husky-release-release-melodic-husky_control-0.4.1-1"

inherit catkin
