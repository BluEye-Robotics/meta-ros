DESCRIPTION = "cob_linear_nav provides a simple navigation instrument driving on a linear path from current position to goal without any planning or obstacle avoidance capabilites. Obstacle avoidance should be carried out in other package, e. g."
AUTHOR = "Matthias Gruhler"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "angles actionlib cob-srvs geometry-msgs move-base-msgs nav-msgs roscpp tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/melodic/cob_linear_nav/0.6.9-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "52c82fa48a55e6558afdf504e4148a11"
SRC_URI[sha256sum] = "277f25f03514cda90bf6fa1a867bf6a6c407c3f55113849a7e40bebf79624aa3"

ROS_SPN = "cob_navigation"
S = "${WORKDIR}/cob_navigation-release-release-melodic-cob_linear_nav-0.6.9-1"

inherit catkin
