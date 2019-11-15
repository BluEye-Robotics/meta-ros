DESCRIPTION = "The cob_model_identifier package"
AUTHOR = "Christoph Mark"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "boost cmake-modules geometry-msgs kdl-parser orocos-kdl roscpp roslint sensor-msgs std-srvs tf"

RDEPENDS_${PN} = "rospy"

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_model_identifier/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3937dd386f0c97a3a9b77219ae5d7b25"
SRC_URI[sha256sum] = "1e04326126ce9e7b5fd42e3ff2cb8840bf56c81dda46d8c1c9bc720c2c66e5e1"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_model_identifier-0.8.1-1"

inherit catkin
