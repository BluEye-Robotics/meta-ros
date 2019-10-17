DESCRIPTION = "The cob_common stack hosts common packages that are used within the Care-O-bot repository. E. g. utility packages or common message and service definitions etc. Also the urdf desciption of the robot is located in this stack."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-actions cob-description cob-msgs cob-srvs raw-description"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/cob_common/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9f8d461ec046efb72c8fce7bf96d582b"
SRC_URI[sha256sum] = "84d1c74ce5aab95a64c655926aef6a9b76df9d5acd2c683fa5319e3015ff4dd6"

S = "${WORKDIR}/cob_common-release-release-melodic-cob_common-0.6.10-0"

inherit catkin
