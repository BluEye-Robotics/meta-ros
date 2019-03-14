DESCRIPTION = "Node/nodelet combination to transform sensor_msgs::Imu data from one frame into another."
AUTHOR = "Paul Bovbel"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "geometry-msgs nodelet message-filters roscpp roslaunch sensor-msgs tf2 tf2-ros tf2-sensor-msgs topic-tools geometry-msgs nodelet message-filters roscpp roslaunch sensor-msgs tf tf2 tf2-ros tf2-sensor-msgs topic-tools"

RDEPENDS_${PN} = "geometry-msgs nodelet message-filters roscpp roslaunch sensor-msgs tf tf2 tf2-ros tf2-sensor-msgs topic-tools"

SRC_URI = "https://github.com/ros-gbp/imu_pipeline-release/archive/release/melodic/imu_transformer/0.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ea123b6d5e2c6cc9b297791521085b76"
SRC_URI[sha256sum] = "385d6b98746a58cc8dcc26c189a5a3c9853b553794798cd352ebe3445def8dd3"

ROS_SPN = "imu_pipeline"
S = "${WORKDIR}/imu_pipeline-release-release-melodic-imu_transformer-0.2.3-0"

inherit catkin
