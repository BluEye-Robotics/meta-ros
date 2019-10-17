DESCRIPTION = "This package is a wrapper for the implementation of EKF-based SLAM with range-bearing sensors, odometry, a full 6D robot pose, and 3D landmarks."
AUTHOR = "Jose Luis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp roslaunch roslib tf std-msgs sensor-msgs visualization-msgs nav-msgs mrpt-bridge dynamic-reconfigure cmake-modules mrpt1"

RDEPENDS_${PN} = " mrpt-rawlog"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/melodic/mrpt_ekf_slam_3d/0.1.10-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "adc4f0c38485b9835c20c97d00e0e5a5"
SRC_URI[sha256sum] = "a2e86b343a30fa5f18bacf864fbdbc0623114a646802dd39fabab40f08ab3535"

ROS_SPN = "mrpt_slam"
S = "${WORKDIR}/mrpt_slam-release-release-melodic-mrpt_ekf_slam_3d-0.1.10-1"

inherit catkin
