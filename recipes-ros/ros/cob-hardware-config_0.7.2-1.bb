DESCRIPTION = "This package contains configuration for each robot instance (e. g. cob4-X, raw3-X). There is a directory for each robot with configuration about urdf and hardware/device configurations."
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cob-supported-robots roslaunch rostest"

RDEPENDS_${PN} = "cob-calibration-data cob-description cob-omni-drive-controller costmap-2d diagnostic-aggregator joint-state-controller joint-state-publisher joint-trajectory-controller laser-filters position-controllers raw-description robot-state-publisher  velocity-controllers xacro"

SRC_URI = "https://github.com/ipa320/cob_robots-release/archive/release/melodic/cob_hardware_config/0.7.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d4458846e5dc454206dba38c9ce716eb"
SRC_URI[sha256sum] = "a2771fecd349087dd110e05334e978a7b179e53d860a1f926b4f18f61a19fc61"

ROS_SPN = "cob_robots"
S = "${WORKDIR}/cob_robots-release-release-melodic-cob_hardware_config-0.7.2-1"

inherit catkin
