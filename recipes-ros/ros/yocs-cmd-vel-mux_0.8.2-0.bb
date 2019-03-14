DESCRIPTION = "A multiplexer for command velocity inputs. Arbitrates incoming cmd_vel messages from several topics, allowing one topic at a time to command the robot, based on priorities. It also deallocates current allowed topic if no messages are received after a configured timeout. All topics, together with their priority and timeout are configured through a YAML file, that can be reload at runtime."
AUTHOR = "Jorge Santos Simon"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp nodelet dynamic-reconfigure pluginlib geometry-msgs yaml-cpp roscpp geometry-msgs pluginlib nodelet dynamic-reconfigure yaml-cpp"

RDEPENDS_${PN} = "roscpp geometry-msgs pluginlib nodelet dynamic-reconfigure yaml-cpp"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_cmd_vel_mux/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7f891d165914014e2a0dab3e14bc1f7b"
SRC_URI[sha256sum] = "fb7a0444d33e684e14c5c1b78fa3c2cda433abbd202401316232daff02af5791"

ROS_SPN = "yujin_ocs"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_cmd_vel_mux-0.8.2-0"

inherit catkin
