DESCRIPTION = "The cob_common stack hosts common packages that are used within the Care-O-bot repository. E. g. utility packages or common message and service definitions etc. Also the urdf desciption of the robot is located in this stack."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-actions cob-description cob-msgs cob-srvs raw-description"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/cob_common/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "240f92b756424309b4676e642e5316f3"
SRC_URI[sha256sum] = "5a95533dc1a09a861e9ca6bd7aa0cbd8818861ab78fccb575a96cb0436fb6fc1"

S = "${WORKDIR}/cob_common-release-release-melodic-cob_common-0.7.1-1"

inherit catkin
