DESCRIPTION = "The cob_script_server package provides a simple interface to operate Care-O-bot. It can be used via the python API or the actionlib interface."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation actionlib actionlib-msgs rostest trajectory-msgs"

RDEPENDS_${PN} = "message-runtime cob-actions cob-light cob-mimic cob-sound control-msgs geometry-msgs ipython move-base-msgs python3-pygraphviz rospy std-msgs std-srvs tf urdfdom-py"

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_script_server/0.6.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c84d4c1ad7150b25b2626fd81f09e509"
SRC_URI[sha256sum] = "0fd4ca6b6036b377bf01c359af44641436d6d1a37801f28662519031b2f0b8e4"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-cob_script_server-0.6.15-1"

inherit catkin
