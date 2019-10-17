DESCRIPTION = "The cob_common stack hosts common packages that are used within the Care-O-bot repository. E. g. utility packages or common message and service definitions etc. Also the urdf desciption of the robot is located in this stack."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-actions cob-description cob-msgs cob-srvs raw-description"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/cob_common/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "da1780367a349d4f64c989adc7735326"
SRC_URI[sha256sum] = "8d43687e403871afba8178f7b1382fb575114e835ca1c70f7fa426c41852f749"

S = "${WORKDIR}/cob_common-release-release-melodic-cob_common-0.7.0-1"

inherit catkin
