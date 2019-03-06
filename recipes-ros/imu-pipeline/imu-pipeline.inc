SRC_URI = "https://github.com/ros-perception/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8653dacf6e225d49a67f497e690da3dd"
SRC_URI[sha256sum] = "14856aae48651788e0d7074b4309d789affa8bbf439e9958e47fa24823a0a01d"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "imu_pipeline"
