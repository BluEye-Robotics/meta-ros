DESCRIPTION = "Processors for sensor_msgs::Imu data"
AUTHOR = "Chad Rockey"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp sensor-msgs geometry-msgs nav-msgs tf roscpp sensor-msgs geometry-msgs nav-msgs tf"

RDEPENDS_${PN} = "roscpp sensor-msgs geometry-msgs nav-msgs tf"

SRC_URI = "https://github.com/ros-gbp/imu_pipeline-release/archive/release/melodic/imu_processors/0.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "151cdfab6de148f5afa3b9402557c1b2"
SRC_URI[sha256sum] = "68dd63390a89e5634e7ae241aa2e8c21e8e80753d49eaf8569de7f8ac1c8dfd3"

ROS_SPN = "imu_pipeline"
S = "${WORKDIR}/imu_pipeline-release-release-melodic-imu_processors-0.2.3-0"

inherit catkin
