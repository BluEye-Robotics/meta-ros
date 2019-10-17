DESCRIPTION = "The main purpose of the cob_twist_controller is to convert target twists into joint velocities. Therefore it makes use of several implemented inverse kinematics approaches at the first order differential level. The inverse differential kinematics solver considers kinematic chain extensions, singularity robustness, redundancy resolution and priority-based methods. To avoid hardware destruction there is a limiter interface active as well. Via parameter server users can dynamically configure the solving strategy."
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roslint boost cmake-modules cob-control-msgs cob-srvs dynamic-reconfigure eigen-conversions libeigen geometry-msgs kdl-conversions kdl-parser nav-msgs orocos-kdl pluginlib roscpp sensor-msgs std-msgs tf tf-conversions trajectory-msgs urdf visualization-msgs"

RDEPENDS_${PN} = "cob-frame-tracker robot-state-publisher rospy  topic-tools xacro"

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_twist_controller/0.8.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "471a9549e1642e01254e5be57af9f2c3"
SRC_URI[sha256sum] = "b9d449b443b20e83c4918a015cae7b7e1a850583bf560f3ac75b4974939db22e"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_twist_controller-0.8.0-1"

inherit catkin
